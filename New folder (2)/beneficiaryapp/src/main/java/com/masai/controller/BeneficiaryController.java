package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BeneficiaryException;
import com.masai.model.BeneficiaryDetails;
import com.masai.service.BeneficiaryService;

@RestController
public class BeneficiaryController {

	@Autowired
	private BeneficiaryService bService;

	@PostMapping("/beneficiaries")
	public ResponseEntity<BeneficiaryDetails> addBenificiaryHandler(@Valid @RequestBody BeneficiaryDetails bd)
			throws BeneficiaryException {

		BeneficiaryDetails bef = bService.addBenificiary(bd);

		return new ResponseEntity<BeneficiaryDetails>(bef, HttpStatus.CREATED);
	}

	@DeleteMapping("/beneficiaries")
	public ResponseEntity<BeneficiaryDetails> deleteBenificiaryHandler(@Valid @RequestBody BeneficiaryDetails bd)
			throws BeneficiaryException {

		BeneficiaryDetails delbef = bService.deleteBenificiary(bd);

		return new ResponseEntity<BeneficiaryDetails>(delbef, HttpStatus.OK);
	}

	@GetMapping("/beneficiaries/{mobilenumber}")
	public ResponseEntity<BeneficiaryDetails> viewBenificiaryHandler(@PathVariable("mobilenumber") String mobilenumber)
			throws BeneficiaryException {

		BeneficiaryDetails bef = bService.viewBenificiary(mobilenumber);

//		 HttpHeaders hh =new HttpHeaders();
//		 hh.add("user", "beneficiary");
//		 hh.add("hello", bef.getName());
		
		return new ResponseEntity<BeneficiaryDetails>(bef, HttpStatus.OK);
	}
}

