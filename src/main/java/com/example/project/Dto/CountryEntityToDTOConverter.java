//package com.example.project.Dto;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import com.example.project.entity.CountryEntity;
//
//public class CountryEntityToDTOConverter {
//    public static CountryDTO convertToDTO(CountryEntity countryEntity) {
//        return new CountryDTO(countryEntity.getCountryId(), countryEntity.getCountryName());
//    }
//
//    public static List<CountryDTO> convertToDTO(List<CountryEntity> countryEntities) {
////        return countryEntities.stream()
//                .map(CountryEntityToDTOConverter::convertToDTO)
//                .collect(Collectors.toList());
//    }
//}
