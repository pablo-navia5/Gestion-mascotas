package com.example.backend.converters;

import com.example.backend.dtos.PetDto;
import com.example.backend.models.PetModel;

import org.jspecify.annotations.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class PetDtoToModelConverter implements Converter<PetDto, PetModel> {

    @Override
    public PetModel convert(@NonNull final PetDto source) {
        Assert.notNull(source, "La mascota no puede ser nula.");

        return new PetModel(
                source.getId(),
                source.getName(),
                source.getSpecies(),
                source.getAge(),
                source.getWeight()
        );
    }
}
