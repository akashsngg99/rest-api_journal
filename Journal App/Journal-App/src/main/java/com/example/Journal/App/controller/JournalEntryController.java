package com.example.Journal.App.controller;


import com.example.Journal.App.entity.journalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;



@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, journalEntity> journalEntries = new HashMap<>();

    @GetMapping
    public List<journalEntity> getAllEntries() {
        // Logic to retrieve all journal entries
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody journalEntity entry) {
        // Logic to create a new journal entry
        journalEntries.put(entry.getId(), entry);

        return true;
    }

    @GetMapping("id/{myId}")
    public journalEntity getEntryById(@PathVariable Long myId) {
        // Logic to retrieve a journal entry by ID
        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public journalEntity deleteEntryById(@PathVariable Long myId) {
        // Logic to retrieve a journal entry by ID
        return journalEntries.remove(myId);
    }

    @PatchMapping("id/{myId}")
    public journalEntity updateEntryById(@PathVariable Long myId, @RequestBody journalEntity updatedEntry) {
        // Logic to update a journal entry by ID

        return journalEntries.put(myId, updatedEntry);
    }
}
