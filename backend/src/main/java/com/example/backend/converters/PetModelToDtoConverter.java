package com.example.backend.converters;

import com.example.backend.dtos.PetDto;
import com.example.backend.models.PetModel;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class PetModelToDtoConverter implements Converter<PetModel, PetDto> {

    @Override
    public PetDto convert(@NonNull final PetModel source) {
        Assert.notNull(source, "La mascota no puede ser nula");

        return new PetDto(
                source.getId(),
                source.getName(),
                source.getSpecies(),
                source.getAge(),
                source.getWeight()
        );
    }
}
