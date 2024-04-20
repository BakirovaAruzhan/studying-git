package everset_academy.BookManagement.User.controller;

import everset_academy.BookManagement.User.domain.Group;
import everset_academy.BookManagement.User.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/group")
public class GroupController {

    private GroupRepository groupRepository;

    @Autowired
    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @PostMapping
    public Group save(@RequestBody Group group) {
        return groupRepository.save(group);
    }

    @GetMapping("/{id}")
    public Group findById(@PathVariable Long id) {
        return groupRepository.findById(id);
    }

}