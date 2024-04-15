package com.example.project.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Dto.CityDto;
import com.example.project.Dto.LoginDto;
import com.example.project.Dto.RegisterDto;
import com.example.project.Dto.ResetpwdDto;
import com.example.project.Dto.StateDto;
import com.example.project.Dto.UserDto;
import com.example.project.Repository.CityRepo;
import com.example.project.Repository.CountryRepo;
import com.example.project.Repository.StateRepo;
import com.example.project.Repository.UserDtlsRepo;
import com.example.project.entity.CountryEntity;
import com.example.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDtlsRepo userdtlsRepo;
	
	@Autowired(required = true)
	private CountryRepo countryRepo;

	@Autowired(required = true)
	private StateRepo StateRepo;

	@Autowired(required = true)
	private CityRepo cityRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CountryEntity> getAllCountry() {
		// TODO Auto-generated method stub
		 List<CountryEntity> countrylist = this.countryRepo.findAllById(Integer id);
		
		
	
		return countrylist;
	}

//	
//	@Override
//	public Map<Integer, String> getAllCountry() {
//		// TODO Auto-generated method stub
//		// List<CountryEntity> countrylist = this.countryRepo.findAll();
//		
//		
//		Map<Integer, String> map = new HashMap();
//		
//		map =(Map<Integer, String>) countryRepo.findAll();
//		//map = (Map<Integer, CountryDTO>) this.countryRepo.findAll();
//
//		// List<CountryDTO> countryDTO2 = new ArrayList();
//
//		// System.out.println("inside findAllCountry:::1111 ***" +
//		// countrylist.get(0).toString());
//
//		// List<CountryDto> countryDto = modelMapper.map(countrylist,
//		// ((TypeToken<List<CountryDto>>) new
//		// TypeToken<List<CountryDto>>(){}).getType());
//
//		List<CountryEntity> countryEntities = this.countryRepo.findAll();// Fetch countries from your data source
//
//		CountryDTO countryDTOtest = this.modelMapper.map(countryEntities, CountryDTO.class);
//
//		// countryDTO2 = Arrays.asList(((ModelMapper) countryDTO2).map(countrylist,
//		// CountryDTO[].class));
//
////
////		@SuppressWarnings("unchecked")
////		List<CountryDto> countryDto1 =(List<CountryDto>) countrylist
////									.stream()
////									.map(country -> modelMapper.map(country, CountryDto.Class))
////									.collect(Collectors.toList());
////		
//
//		System.out.println("inside findAllCountry::: " + countryDTOtest.toString());
//
//		return map;
//	}

	@Override
	public List<StateDto> getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CityDto> getCity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public boolean registerUser(RegisterDto regDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto getUser(LoginDto loginDto) {
		// TODO Auto-generated method stub
		
//		UserEntity user = userdtlsRepo.findByEmailAndPwd();
//		
//		if(user == null) {
//			
//			return null;
//		}
//		ModelMapper  mapper = new ModelMapper();
//		return mapper.map(user,UserDto.class);
		
		return null;
	}

	@Override
	public boolean resetPwd(ResetpwdDto pwdDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getQuote() {
		// TODO Auto-generated method stub
		return null;
	}

}
