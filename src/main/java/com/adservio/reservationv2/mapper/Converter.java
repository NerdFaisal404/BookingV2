package com.adservio.reservationv2.mapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;


@RequiredArgsConstructor
@Component
public class Converter {
    private final ModelMapper modelMapper;
    public <TClazz,TDtoClazz extends Serializable> TDtoClazz modelToDto(TClazz user, Class<TDtoClazz> tDto){
        return modelMapper.map(user,tDto);
    }




}
