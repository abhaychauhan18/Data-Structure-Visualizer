package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/")
	public String viewHomePage() {
		return "index.html";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "logout";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	All Algoritham Rendering
	
//	Array
	@GetMapping("/array")
	public String array() {
		return "array.html";
	}
	@GetMapping("/array_adt")
	public String array_adt() {
		return "array/array_adt.html";
	}
	@GetMapping("/linear")
	public String linear() {
		return "array/linear.html";
	}
	
	
//	stack
	@GetMapping("/stack")
	public String stack() {
		return "stack.html";
	}
	@GetMapping("/stack_adt")
	public String stack_adt() {
		return "stack/stack_adt.html";
	}
	@GetMapping("/balanced_bracket")
	public String balanced_bracket() {
		System.out.println("Balanced");
		return "stack/bb.html";
	}
	@GetMapping("/infix_to_postfix")
	public String infix_to_postfix() {
		return "stack/infix_to_postfix.html";
	}
	@GetMapping("/infix_to_prefix")
	public String infix_to_prefix() {
		return "stack/infix_to_prefix.html";
	}
	@GetMapping("/postfix_evaluation")
	public String postfix_evaluation() {
		return "stack/postfix_evaluation.html";
	}
	@GetMapping("/prefix_evaluation")
	public String prefix_evaluation() {
		return "stack/prefix_evaluation.html";
	}
	
	
	
//	queue
	@GetMapping("/queue")
	public String queue() {
		return "queue.html";
	}
	@GetMapping("/queue_adt")
	public String queue_adt() {
		return "queue/queue_adt.html";
	}
	@GetMapping("/bfs")
	public String bfs() {
		return "queue/bfs.html";
	}
	
	
//	Linkedlist
	@GetMapping("/linkedlist")
	public String Linkedlist() {
		return "linkedlist.html";
	}
	@GetMapping("/singly")
	public String singly() {
		return "linked_list/singly.html";
	}
	@GetMapping("/doubly")
	public String doubly() {
		return "linked_list/doubly.html";
	}
	@GetMapping("/circular_singly")
	public String circular_singly() {
		return "linked_list/circular_singly.html";
	}
	@GetMapping("/circular_doubly")
	public String circular_doubly() {
		return "linked_list/circular_doubly.html";
	}
	@GetMapping("/linked_stack")
	public String linked_stack() {
		return "linked_list/linked_stack.html";
	}
	@GetMapping("/linked_queue")
	public String linked_queue() {
		return "linked_list/linked_queue.html";
	}
	
	
//	recursion
	@GetMapping("/recursion")
	public String recursion() {
		return "recursion.html";
	}
	@GetMapping("/factorial")
	public String factorial() {
		return "recursion/factorial.html";
	}
	@GetMapping("/tower_of_hanoi")
	public String tower_of_hanoi() {
		return "recursion/tower_of_hanoi.html";
	}
	
//	tree
	@GetMapping("/tree")
	public String tree() {
		return "tree.html";
	}
	@GetMapping("/binary")
	public String binary() {
		return "bst/binary.html";
	}
	@GetMapping("/traversal")
	public String traversal() {
		return "bst/traversal.html";
	}
	@GetMapping("/bst_delete")
	public String bst_delete() {
		return "bst/bst_delete.html";
	}
	
	
//	search
	@GetMapping("/search")
	public String search() {
		return "search.html";
	}
	@GetMapping("/binary1")
	public String binary1() {
		return "search_algorithms/binary.html";
	}
	@GetMapping("/rotated_array")
	public String rotated_array() {
		return "search_algorithms/rotated_array.html";
	}
	@GetMapping("/peak_element")
	public String peak_element() {
		return "search_algorithms/peak_element.html";
	}
	
	
//	sort
	@GetMapping("/sort")
	public String sort() {
		return "sort.html";
	}
	@GetMapping("/sort/bubble")
	public String bubble() {
		return "sort_algorithms/bubble.html";
	}
	@GetMapping("/bubble")
	public String bubble1() {
		return "sort_array/bubble.html";
	}
	@GetMapping("/selection")
	public String selection() {
		return "sort_array/selection.html";
	}
	@GetMapping("/insertion")
	public String insertion() {
		return "sort_array/insertion.html";
	}
	@GetMapping("/merge")
	public String merge() {
		return "merge.html";
	}
	@GetMapping("/quick")
	public String quick() {
		return "quick.html";
	}
	@GetMapping("/counting")
	public String counting() {
		return "counting.html";
	}
	@GetMapping("/heap")
	public String heap() {
		return "heap.html";
	}
	@GetMapping("/shell")
	public String shell() {
		return "shell.html";
	}
//	@GetMapping("/sort")
//	public String sort() {
//		return "sort.html";
//	}
	
	
	
//	divide_and_conquer
	@GetMapping("/divide_and_conquer")
	public String divide_and_conquer() {
		return "divide_and_conquer.html";
	}
	@GetMapping("/merge1")
	public String merge1() {
		return "divide_and_conquer/merge.html";
	}
	@GetMapping("/quick1")
	public String quick1() {
		return "divide_and_conquer/quick.html";
	}
	@GetMapping("/counting_inversion")
	public String counting_inversion() {
		return "divide_and_conquer/counting_inversion.html";
	}
	
	
	
	
//	questions
	@GetMapping("/questions")
	public String questions() {
		return "questions.html";
	}
	
	
	
	
	
	
	
	
}
