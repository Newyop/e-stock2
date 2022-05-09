package com.qartw.stockmarket.services;

import com.qartw.stockmarket.dto.CompanyDetailsDTO;

public interface CompanyDetailsService {
	
	public CompanyDetailsDTO saveCompanyDetails(CompanyDetailsDTO companyDetailsDTO);
	public CompanyDetailsDTO deleteCompany(Long companyCode);
	public CompanyDetailsDTO getCompanyInfoById(Long companyCode);
}
