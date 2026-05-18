package com.example.backend.facades.impl;

import com.example.backend.dtos.PetDto;
import com.example.backend.facades.PetFacade;
import com.example.backend.models.PetModel;
import com.example.backend.services.PetService;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class PetFacadeImpl implements PetFacade {

    private final PetService petService;

    private final Converter<PetDto, PetModel> toModelConverter;
    private final Converter<PetModel, PetDto> toDtoConverter;

    @Override
    public List<PetDto> findAll() {
        return petService.findAll()
                         .stream()
                         .map(toDtoConverter::convert)
                         .toList();
    }

    @Override
    public Optional<PetDto> findById(final String id) {
        return petService.findById(id)
                         .map(toDtoConverter::convert);
    }

    @Override
    public List<PetDto> findByName(final String name) {
        return petService.findByName(name)
                         .stream()
                         .map(toDtoConverter::convert)
                         .toList();
    }

    @Override
    public void deleteById(final String id) {
        petService.deleteById(id);
    }

    @Override
    public PetDto save(final PetDto petDto) {
        final PetModel petSaved = petService.save(toModelConverter.convert(petDto));

        return toDtoConverter.convert(petSaved);
    }
}
