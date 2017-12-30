package pl.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String wywolywaczHome() {
		return "home";
	}
	
	@PostMapping("/")
	public String wywolywaczHome(@RequestParam(defaultValue = "0", required = true) int liczba) {
		System.out.println(liczba);
		if (liczba > 5) {
			System.out.println("Liczba większa niż 5!");
			return "strona";
		}

		else if (liczba == 5) {
			System.out.println("Liczba równa 5!");
			return "home";
		} else {

			System.out.println("Liczba mniejsza od 5");
			return "druga";
		}

	}
}
