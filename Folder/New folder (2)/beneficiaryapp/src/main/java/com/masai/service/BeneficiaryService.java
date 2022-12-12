package com.masai.service;

import java.util.List;

import com.masai.exception.BeneficiaryException;
import com.masai.model.BeneficiaryDetails;

public interface BeneficiaryService {

	public BeneficiaryDetails addBenificiary(BeneficiaryDetails bd )  throws BeneficiaryException;

	public BeneficiaryDetails deleteBenificiary(BeneficiaryDetails bd )throws BeneficiaryException;

	public BeneficiaryDetails viewBenificiary(String mobno)throws BeneficiaryException;

	//public List<BeneficiaryDetails> viewAllBenificiary(Customer customer) throws BankAccountException;
}
