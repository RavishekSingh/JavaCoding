package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.BeneficiaryException;
import com.masai.model.BeneficiaryDetails;
import com.masai.repository.BeneficiaryDetailsRepo;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

	@Autowired
	private BeneficiaryDetailsRepo bRepo;

	@Override
	public BeneficiaryDetails addBenificiary(BeneficiaryDetails bd) throws BeneficiaryException {

		BeneficiaryDetails bef = bRepo.save(bd);

		return bef;

	}

	@Override
	public BeneficiaryDetails deleteBenificiary(BeneficiaryDetails bd) throws BeneficiaryException {

		Optional<BeneficiaryDetails> opt = bRepo.findById(bd.getMobilenumber());

		if (opt.isPresent()) {

			BeneficiaryDetails existe = opt.get();
			bRepo.delete(existe);
			return existe;
		} else
			throw new BeneficiaryException("Beneficiary does not exist");
	}

	@Override
	public BeneficiaryDetails viewBenificiary(String mobno) throws BeneficiaryException {

		Optional<BeneficiaryDetails> opt = bRepo.findById(mobno);

		if (opt.isPresent()) {
			BeneficiaryDetails bef = opt.get();

			return bef;
		} else
			throw new BeneficiaryException("No Beneficiary with mobilenumber: " + mobno);
	}

}
