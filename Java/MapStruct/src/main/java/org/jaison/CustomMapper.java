package org.jaison;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomMapper {
    @Mapping(target = "xfaceRDAccount", source = "RDAccount")
    TargetClass mapToTarget(SourceClass sourceClass);
}
