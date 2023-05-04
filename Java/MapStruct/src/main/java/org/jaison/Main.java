package org.jaison;

import org.mapstruct.factory.Mappers;

public class Main {

    public static void main(String[] args) {
        CustomMapper mapper = Mappers.getMapper(CustomMapper.class);
        SourceClass sourceClass = new SourceClass();
        sourceClass.setRDAccount("123");
        TargetClass targetClass = mapper.mapToTarget(sourceClass);
        System.out.println(targetClass.getXfaceRDAccount());
    }
}