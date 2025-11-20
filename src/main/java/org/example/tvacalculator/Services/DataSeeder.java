    package org.example.tvacalculator.Services;

    import org.example.tvacalculator.Entities.*;
    import org.example.tvacalculator.Repositories.*;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.stereotype.Component;

    import java.math.BigDecimal;

    @Component
    public class DataSeeder implements CommandLineRunner {

        private final CountryRepository countryRepo;
        private final ProductCategoryRepository categoryRepo;
        private final TaxTypeRepository taxTypeRepo;
        private final TaxRuleRepository taxRuleRepo;
        private final ProductRepository productRepo;

        public DataSeeder(CountryRepository countryRepo,
                          ProductCategoryRepository categoryRepo,
                          TaxTypeRepository taxTypeRepo,
                          TaxRuleRepository taxRuleRepo,
                          ProductRepository productRepo) {
            this.countryRepo = countryRepo;
            this.categoryRepo = categoryRepo;
            this.taxTypeRepo = taxTypeRepo;
            this.taxRuleRepo = taxRuleRepo;
            this.productRepo =  productRepo;
        }

        @Override
        public void run(String... args) {

            if (countryRepo.count() > 0) return;

            // Countries
            Country tn = countryRepo.save(
                    Country.builder().name("Tunisia").build()
            );

            // Categories
            ProductCategory electronics = categoryRepo.save(
                    ProductCategory.builder().name("Electronics").build()
            );

            ProductCategory food = categoryRepo.save(
                    ProductCategory.builder().name("Food").build()
            );

            TaxType tva = taxTypeRepo.save(
                    TaxType.builder().code("TVA").description("Taxe sur la valeur ajoutée").build()
            );

            TaxType css = taxTypeRepo.save(
                    TaxType.builder().code("CSS").description("Contribution sociale de solidarité").build()
            );

            taxRuleRepo.save(
                    TaxRule.builder()
                            .country(tn)
                            .category(electronics)
                            .taxType(tva)
                            .rate(new BigDecimal("0.19")) // 19%
                            .build()
            );

            taxRuleRepo.save(
                    TaxRule.builder()
                            .country(tn)
                            .category(electronics)
                            .taxType(css)
                            .rate(new BigDecimal("0.01")) // 1%
                            .build()
            );

            taxRuleRepo.save(
                    TaxRule.builder()
                            .country(tn)
                            .category(food)
                            .taxType(tva)
                            .rate(new BigDecimal("0.07")) // 7%
                            .build()
            );

            taxRuleRepo.save(
                    TaxRule.builder()
                            .country(tn)
                            .category(food)
                            .taxType(css)
                            .rate(new BigDecimal("0.01")) // 1%
                            .build()
            );

            // Sample product
            productRepo.save(
                    Product.builder()
                            .name("Samsung TV")
                            .category(electronics)
                            .originCountry(tn)
                            .build()
            );

            System.out.println("✅ Seeded real Tunisian tax data.");
        }
    }