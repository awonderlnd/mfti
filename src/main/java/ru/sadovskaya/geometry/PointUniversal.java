package ru.sadovskaya.geometry;

import java.util.ArrayList;
import java.util.List;

public class PointUniversal {
    private List<Attribute> attributeList = new ArrayList<>();

    public Attribute getAttribute(String name) {
        for (Attribute att : attributeList) {
            if (att.getName().equals(name)) return att;
        }
        return null;
    }

    public void addAttribute(Attribute attribute) {
        for (Attribute att : attributeList) {
            if (attribute.getName().equals(att.getName())) {
                attributeList.set(attributeList.indexOf(att), attribute);
            }
        }
        attributeList.add(attribute); //почему через else здесь получаются пустые списки?
        //а так логично выходит дублирование, которого я хочу избежать
    }

    public List<Attribute> getAttributeList() {
        return new ArrayList<>(attributeList);
    }

    @Override
    public String toString() {
        return "Точка с характеристиками: " + attributeList;
    }
}
