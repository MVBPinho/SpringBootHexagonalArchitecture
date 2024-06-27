package com.arantes.hexagonal.config;

import com.arantes.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.arantes.hexagonal.application.core.usecase.DeleteCustomerByUseCase;
import com.arantes.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByUseCase deleteCustomerByUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
            ) {
        return new DeleteCustomerByUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}