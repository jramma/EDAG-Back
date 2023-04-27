package com.joBarcelona.edag.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joBarcelona.edag.model.domain.CenterInfo;
import com.joBarcelona.edag.model.domain.Checkout;
import com.joBarcelona.edag.model.domain.Count;
import com.joBarcelona.edag.model.domain.MealInfo;
import com.joBarcelona.edag.model.domain.NumMedioOrdersPorCentro;
import com.joBarcelona.edag.model.domain.Porcentaje;
import com.joBarcelona.edag.model.domain.Progresion;
import com.joBarcelona.edag.model.domain.WeeklyDemand;
import com.joBarcelona.edag.model.repository.CenterRepository;
import com.joBarcelona.edag.model.repository.CheckoutRepo;
import com.joBarcelona.edag.model.repository.CountRepo;
import com.joBarcelona.edag.model.repository.MealInfoRepo;
import com.joBarcelona.edag.model.repository.NumRepo;
import com.joBarcelona.edag.model.repository.PorcentajeRepo;
import com.joBarcelona.edag.model.repository.ProgRepo;
import com.joBarcelona.edag.model.repository.WeeklyDemandRepository;

@Service
public class MarketService {
	@Autowired
    CenterRepository centerRepository;

	@Autowired
    WeeklyDemandRepository weeklyDemandRepository;
	@Autowired
    MealInfoRepo mealInfoRepo;
	@Autowired
    CheckoutRepo checkoutRepo;
	@Autowired
    CountRepo countRepo;
	@Autowired
	NumRepo numRepo;
	@Autowired
	PorcentajeRepo porcentajeRepo;
	@Autowired
	ProgRepo progRepo;
	public List<CenterInfo> getAllCenters() {
		return centerRepository.findAll();
	}

	public List<WeeklyDemand> getAllWeeklyDemand() {
		return weeklyDemandRepository.findAll();
	}

	public List<MealInfo> getAllProductsInfo() {
		return mealInfoRepo.findAll();
	}

	

	public List<Checkout> getCheckouts() {
		return checkoutRepo.findAll();
	}

	public List<Count> getCount() {
		return countRepo.findAll();
	}
	public List<NumMedioOrdersPorCentro> orderPerCenter() {
		return numRepo.findAll();
	}

	public List<Porcentaje> getPorcentajes() {
		return porcentajeRepo.findAll();
	}
	public List<Progresion> getProgresions() {
		return progRepo.findAll();
	}
}
