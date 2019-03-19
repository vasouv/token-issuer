package vs.tokenissuer.dbloader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import vs.tokenissuer.model.Role;
import vs.tokenissuer.model.User;
import vs.tokenissuer.repository.UserRepository;

/**
 * DatabaseLoader
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    public DatabaseLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        var vasouv = new User("vasouv", "vasouv@mail.com", "444", Role.JAVA, true);
        var myrtia = new User("myrtia", "myrtia@mail.com", "444", Role.QA, true);
        var chris = new User("chris", "chris@mail.com", "444", Role.PHP, true);
        var elina = new User("elina", "elina@mail.com", "444", Role.PHP, true);
        var apostolis = new User("apostolis", "apostolis@mail.com", "444", Role.PHP, true);
        var vasilis = new User("vasilis", "vasilis@mail.com", "444", Role.ANDROID, true);

        userRepository.save(vasouv);
        userRepository.save(myrtia);
        userRepository.save(chris);
        userRepository.save(elina);
        userRepository.save(apostolis);
        userRepository.save(vasilis);

    }
        
}