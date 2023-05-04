package org.jaison;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-04T15:18:06+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_362 (Amazon.com Inc.)"
)
public class CustomMapperImpl implements CustomMapper {

    @Override
    public TargetClass mapToTarget(SourceClass sourceClass) {
        if ( sourceClass == null ) {
            return null;
        }

        TargetClass targetClass = new TargetClass();

        targetClass.setXfaceRDAccount( sourceClass.getRDAccount() );

        return targetClass;
    }
}
