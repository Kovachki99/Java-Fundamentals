package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, List<String>> courses = new LinkedHashMap<>();
		String[] command = scan.nextLine().split(" : ");
		while (!command[0].equals("end")) {
			String courseName = command[0];
			String name = command[1];
			if (courses.containsKey(courseName)) {
				courses.get(courseName).add(name);
			} else {
				List<String> names = new ArrayList<>();
				names.add(name);
				courses.put(courseName, names);
			}
			command = scan.nextLine().split(" : ");
		}
		courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())).forEach(
				entry -> {
					System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
					List<String> value = new ArrayList<>(entry.getValue());
					value.stream().sorted().forEach(name -> System.out.printf(" -- %s%n", name));
				});
	}
}
