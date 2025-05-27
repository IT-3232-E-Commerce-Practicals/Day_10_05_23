	}
	
	public String addDept(Department department) {
		// before adding a department make sure that the department id is unique
		if(repo.findById(department.getId()).isPresent()) {
			throw new DuplicateKeyException("The Department id is already available");
		}
		repo.save(department);
		return "New Department added";
		
	}
}
