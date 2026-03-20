package com.github.myselfakashagarwal.experiments.designpatterns.core.controller;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.ElementFactory;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button.AbstractButton;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container.AbstractContainer;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container.FormBuilder;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input.AbstractInput;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text.AbstractText;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.html.HtmlBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/form")
@CrossOrigin("*")
public class FormController {

    private AbstractContainer currentForm;
    private String currentTheme = "normal";
    private final HtmlBuilder htmlBuilder = new HtmlBuilder();

    @PostMapping("/reset")
    public FormDTO resetForm(@RequestParam(name = "theme", defaultValue = "normal") String theme) {
        this.currentTheme = theme;
        this.currentForm = new FormBuilder(theme).build();
        return toDTO(currentForm);
    }

    @PostMapping("/add")
    public FormDTO addElement(@RequestParam("type") String type, @RequestParam(name = "param", required = false) String param) {
        if (currentForm == null) resetForm(currentTheme);
        
        switch (type.toLowerCase()) {
            case "heading": 
                AbstractText h = (AbstractText) ElementFactory.createHeading(currentTheme);
                h.setText(param != null ? param : "New Heading");
                currentForm.addElement(h);
                break;
            case "paragraph":
                AbstractText p = (AbstractText) ElementFactory.createParagraph(currentTheme);
                p.setText(param != null ? param : "New Paragraph");
                currentForm.addElement(p);
                break;
            case "input":
                AbstractInput i = (AbstractInput) ElementFactory.createInput(param != null ? param : "text", currentTheme);
                i.setPlaceholder("Enter " + (param != null ? param : "text") + "...");
                currentForm.addElement(i);
                break;
            case "button":
                Element b = ElementFactory.createButton(param != null ? param : "confirm", currentTheme);
                currentForm.addElement(b);
                break;
        }
        return toDTO(currentForm);
    }

    @PostMapping("/remove")
    public FormDTO removeElement(@RequestParam("id") String id) {
        if (currentForm != null) {
            Element toRemove = null;
            for (Element e : currentForm.getElements()) {
                if (e.getId().equals(id)) {
                    toRemove = e;
                    break;
                }
            }
            if (toRemove != null) {
                currentForm.removeElement(toRemove);
            }
        }
        return toDTO(currentForm);
    }

    @PostMapping("/clone")
    public FormDTO cloneForm() {
        if (currentForm != null) {
            currentForm = (AbstractContainer) currentForm.cloneElement();
        }
        return toDTO(currentForm);
    }

    @GetMapping("/current")
    public FormDTO getCurrentForm() {
        if (currentForm == null) resetForm(currentTheme);
        return toDTO(currentForm);
    }

    private FormDTO toDTO(AbstractContainer container) {
        FormDTO dto = new FormDTO();
        dto.setTheme(currentTheme);
        dto.setHtml(htmlBuilder.build(container));
        dto.setSidebarHtml(htmlBuilder.buildSidebar(container));
        List<ElementDTO> elementDTOs = new ArrayList<>();
        if (container.getElements() != null) {
            for (Element e : container.getElements()) {
                elementDTOs.add(toElementDTO(e));
            }
        }
        dto.setElements(elementDTOs);
        return dto;
    }

    private ElementDTO toElementDTO(Element e) {
        ElementDTO edto = new ElementDTO();
        edto.setId(e.getId());
        edto.setType(e.getClass().getSimpleName());
        Object style = null;
        if (e instanceof AbstractText) {
            edto.setText(((AbstractText) e).getText());
            style = ((AbstractText) e).getStyle();
        } else if (e instanceof AbstractInput) {
            edto.setPlaceholder(((AbstractInput) e).getPlaceholder());
            style = ((AbstractInput) e).getStyle();
        } else if (e instanceof AbstractButton) {
            style = ((AbstractButton) e).getStyle();
        }
        
        if (style != null) {
            edto.setStyle(toStyleMap(style));
        }
        return edto;
    }

    private Map<String, String> toStyleMap(Object style) {
        Map<String, String> map = new HashMap<>();
        map.put("flyweightId", "STYLE_" + System.identityHashCode(style));
        
        if (style instanceof com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle) {
            com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle s = (com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle) style;
            map.put("padding", s.getPadding());
            map.put("margin", s.getMargin());
            map.put("borderColor", s.getBorderColor());
            map.put("backgroundColor", s.getBackgroundColor());
            map.put("color", s.getColor());
        } else if (style instanceof com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle) {
            com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle s = (com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle) style;
            map.put("padding", s.getPadding());
            map.put("margin", s.getMargin());
            map.put("borderColor", s.getBorderColor());
            map.put("backgroundColor", s.getBackgroundColor());
            map.put("color", s.getColor());
        } else if (style instanceof com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle) {
            com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle s = (com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle) style;
            map.put("padding", s.getPadding());
            map.put("margin", s.getMargin());
            map.put("borderColor", s.getBorderColor());
            map.put("backgroundColor", s.getBackgroundColor());
            map.put("color", s.getColor());
        }
        return map;
    }

    public static class FormDTO {
        private String theme;
        private List<ElementDTO> elements;
        private String html;
        private String sidebarHtml;
        public FormDTO() {}
        public String getTheme() { return theme; }
        public void setTheme(String theme) { this.theme = theme; }
        public List<ElementDTO> getElements() { return elements; }
        public void setElements(List<ElementDTO> elements) { this.elements = elements; }
        public String getHtml() { return html; }
        public void setHtml(String html) { this.html = html; }
        public String getSidebarHtml() { return sidebarHtml; }
        public void setSidebarHtml(String sidebarHtml) { this.sidebarHtml = sidebarHtml; }
    }

    public static class ElementDTO {
        private String id;
        private String type;
        private String text;
        private String placeholder;
        private Map<String, String> style;
        public ElementDTO() {}
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public String getText() { return text; }
        public void setText(String text) { this.text = text; }
        public String getPlaceholder() { return placeholder; }
        public void setPlaceholder(String placeholder) { this.placeholder = placeholder; }
        public Map<String, String> getStyle() { return style; }
        public void setStyle(Map<String, String> style) { this.style = style; }
    }
}
