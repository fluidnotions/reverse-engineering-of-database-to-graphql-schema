package com.example.dvdrental.data;

import com.example.dvdrental.data.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class JpaDao {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private FilmActorRepository filmActorRepository;

    @Autowired
    private FilmCategoryRepository filmCategoryRepository;

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private LanguageRepository languageRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private RentalRepository rentalRepository;

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private StoreRepository storeRepository;

    public List<CrudRepository<?, ?>> getAllReRepositories() {
        return List.of(actorRepository, addressRepository, categoryRepository, cityRepository,
                countryRepository, customerRepository, filmActorRepository, filmCategoryRepository,
                filmRepository, inventoryRepository, languageRepository, paymentRepository, rentalRepository,
                staffRepository, storeRepository);
    }

}

