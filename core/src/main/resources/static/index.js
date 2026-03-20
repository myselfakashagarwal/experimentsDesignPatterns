// whoever going through this experimental code please update the suffering counter in the comments

const API_BASE = '/api/form';
let currentTheme = 'normal';
let currentView = 'preview';


// Generate a pseudo-random session ID
document.getElementById('session-id').innerText = 'sess_' + Math.random().toString(36).substring(2, 8);

function showView(view) {
    currentView = view;
    const previewContainer = document.getElementById('preview-container');
    const codeContainer = document.getElementById('code-container');
    const btnPreview = document.getElementById('btn-preview');
    const btnCode = document.getElementById('btn-code');

    if (view === 'preview') {
        if (previewContainer) previewContainer.style.display = 'flex';
        if (codeContainer) codeContainer.style.display = 'none';
        if (btnPreview) btnPreview.classList.add('active');
        if (btnCode) btnCode.classList.remove('active');
    } else {
        if (previewContainer) previewContainer.style.display = 'none';
        if (codeContainer) codeContainer.style.display = 'block';
        if (btnPreview) btnPreview.classList.remove('active');
        if (btnCode) btnCode.classList.add('active');
    }
    getCurrentState();
    
    if (view === 'code') {
        const rawHtmlCode = document.getElementById('raw-html-code');
        if (rawHtmlCode && typeof Prism !== 'undefined') {
            Prism.highlightElement(rawHtmlCode);
        }
    }
}

async function apiRequest(endpoint, params = {}) {
    const url = new URL(API_BASE + endpoint, window.location.origin);
    Object.keys(params).forEach(key => url.searchParams.append(key, params[key]));
    
    try {
        const response = await fetch(url, { method: 'POST' });
        const data = await response.json();
        updateUI(data);
    } catch (error) {
        console.error('API Error:', error);
    }
}

async function getCurrentState() {
    try {
        const response = await fetch(API_BASE + '/current');
        const data = await response.json();
        updateUI(data);
    } catch (error) {
        console.error('API Error:', error);
    }
}

function updateUI(data) {
    const canvasInner = document.getElementById('canvas-inner');
    const previewContainer = document.getElementById('preview-container');
    const codeContainer = document.getElementById('code-container');
    const previewContent = document.getElementById('preview-content');
    const elementList = document.getElementById('element-list');
    const themePill = document.getElementById('theme-pill');
    const themeSelect = document.getElementById('theme-select');
    const rawHtmlCode = document.getElementById('raw-html-code');

    if (!data) return;

    // Update Theme UI
    currentTheme = data.theme;
    if (themePill) themePill.innerText = data.theme.charAt(0).toUpperCase() + data.theme.slice(1);
    if (themeSelect) themeSelect.value = data.theme;

    // Update Element List
    if (!data.elements || data.elements.length === 0) {
        if (canvasInner) canvasInner.style.display = 'block';
        if (previewContainer) previewContainer.style.display = 'none';
        if (codeContainer) codeContainer.style.display = 'none';
        if (elementList) elementList.innerText = 'Empty';
        if (rawHtmlCode) rawHtmlCode.innerText = '<!-- No elements generated -->';
    } else {
        if (canvasInner) canvasInner.style.display = 'none';
        if (currentView === 'preview') {
            if (previewContainer) previewContainer.style.display = 'flex';
            if (codeContainer) codeContainer.style.display = 'none';
        } else {
            if (previewContainer) previewContainer.style.display = 'none';
            if (codeContainer) codeContainer.style.display = 'block';
        }
        
        if (previewContent) previewContent.innerHTML = data.html;
        if (elementList) elementList.innerHTML = data.sidebarHtml;
        
        if (rawHtmlCode) {
            // Simple formatting for the raw HTML
            const formatted = formatHTML(data.html);
            rawHtmlCode.textContent = formatted;
            if (currentView === 'code' && typeof Prism !== 'undefined') {
                Prism.highlightElement(rawHtmlCode);
            }
        }
    }
}

function formatHTML(xml) {
    let formatted = '';
    let reg = /(>)(<)(\/*)/g;
    xml = xml.replace(reg, '$1\r\n$2$3');
    let pad = 0;
    xml.split('\r\n').forEach(function(node) {
        let indent = 0;
        if (node.match(/.+<\/\w[^>]*>$/)) {
            indent = 0;
        } else if (node.match(/^<\/\w/)) {
            if (pad != 0) {
                pad -= 1;
            }
        } else if (node.match(/^<\w[^>]*[^\/]>.*$/)) {
            indent = 1;
        } else {
            indent = 0;
        }

        let padding = '';
        for (let i = 0; i < pad; i++) {
            padding += '  ';
        }

        formatted += padding + node + '\r\n';
        pad += indent;
    });

    return formatted;
}

function copyCode() {
    const code = document.getElementById('raw-html-code').textContent;
    navigator.clipboard.writeText(code).then(() => {
        const btn = document.querySelector('.copy-btn');
        const originalText = btn.innerHTML;
        btn.innerHTML = '<svg width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><polyline points="20 6 9 17 4 12"></polyline></svg> Copied!';
        setTimeout(() => {
            btn.innerHTML = originalText;
        }, 2000);
    }).catch(err => {
        console.error('Failed to copy code: ', err);
    });
}

function setTheme(theme) {
    apiRequest('/reset', { theme });
}

function addToCanvas() {
    const typeValue = document.getElementById('element-type').value;
    const textValue = document.getElementById('element-text').value;
    
    let type = typeValue;
    let param = null;
    
    if (typeValue.includes(':')) {
        [type, param] = typeValue.split(':');
    } else {
        param = textValue;
    }

    apiRequest('/add', { type, param: param || textValue });
}

function removeById() {
    const id = document.getElementById('remove-id').value;
    if (id) apiRequest('/remove', { id });
}

function clearSession() {
    apiRequest('/reset', { theme: currentTheme });
}

// Init
window.onload = () => {
    getCurrentState();
};
