package com.workshopspring.training.config;

import com.workshopspring.training.entities.Category;
import com.workshopspring.training.entities.Order;
import com.workshopspring.training.entities.User;
import com.workshopspring.training.repositories.CategoryRepository;
import com.workshopspring.training.repositories.OrderRepository;
import com.workshopspring.training.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

import static com.workshopspring.training.entities.enums.OrderStatus.*;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;
    private final CategoryRepository categoryRepository;

    public TestConfig(UserRepository userRepository, OrderRepository orderRepository, CategoryRepository categoryRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2022-06-20T19:53:07Z"), WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"),PAID, u2);
        Order o3 = new Order(null, Instant.parse("2022-07-22T15:21:22Z"), SHIPPED, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
