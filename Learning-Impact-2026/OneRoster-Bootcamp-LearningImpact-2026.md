# OneRoster 1.2 Bootcamp (2 Hours)

## Audience

This bootcamp is designed for:

* Individuals who need to get up to speed on OneRoster 1.2 concepts, structure, and API behavior
* Teams currently running OneRoster 1.1 who are planning or actively executing a 1.1 → 1.2 migration
* Technical and product stakeholders participating in or supporting the **Ed-Fi / OneRoster API alignment efforts**



## Goal

Provide attendees—whether new to OneRoster 1.2 or migrating from 1.1—with the practical understanding, hands-on experience, and implementation guidance needed to work effectively with the 1.2 data model and APIs, and to support real-world integration efforts including Ed-Fi / OneRoster API alignment.



## 1. Learning Objectives

By the end of the session, attendees should be able to:

1. Understand the core key concepts of OneRoster
2. Identify key differences between OneRoster 1.1 and 1.2
3. Understand new/updated data models and endpoints
4. Evaluate impact on their current implementation
5. Apply learned concepts to plan and support a 1.1 → 1.2 migration
6. Validate and troubleshoot a 1.2 deployment



## 2. Agenda (120 minutes)

| Section | Topic | Time   |
|---|----|---|
| 1 | Context | 10 min |
| 2 | Key Differences | 20 min |
| 3 | Guided Hands-On Activity #1: Modifying a 1.1 Dataset for 1.2 | 30 min |
| 4 | Migration Strategy | 10 min |
| 5 | Guided Hands-On Activity #2: Testing a OneRoster 1.2 API | 35 min |
| 6 | Validation + Wrap | 15 min |
## 3. Section Breakdown

### Section 1: Context (20 min)

- Evolution of OneRoster (1.0 → 1.1 → 1.2)
- Core OneRoster concepts:
  - Organizations, Users, Classes, Enrollments
  - CSV vs API paradigms
  - Provider vs Consumer roles
- Drivers for 1.2 adoption:
  - Improved API capabilities
  - Better alignment with real-world SIS/LMS needs
  - Performance and scalability improvements
- Common upgrade triggers

---

### Section 2: Key Differences: 1.1 vs 1.2 (10 min)

#### Topics

- API enhancements
  - Expanded endpoints
  - Filtering and pagination improvements
- Data model updates
- Security and authentication considerations
- CSV vs API parity changes

#### Activity (Embedded Discussion)

- Identify:
  - What breaks
  - What improves
- Prepare participants for Activity #1 by highlighting:
  - Structural changes they will need to implement
  - Common areas where 1.1 assumptions fail

---

### Section 3: Guided Hands-On Activity #1: Modifying a 1.1 Dataset for 1.2 (30 min)

Using the provided 1.1 CSV dataset and your understanding of the OneRoster 1.2 specification, modify the dataset to be syntactically compliant with 1.2.

Focus on:
- Required field updates  
- Structural changes  
- Relationship and reference integrity  

**Wrap-up:**  
Facilitated group discussion on:
- What changes were required  
- What was unclear or unexpected  
- Where 1.1 assumptions no longer hold in 1.2  

---

### Section 4: Migration Strategy (10 min)

#### Upgrade Approaches

1. Parallel implementation (recommended)  
2. In-place upgrade (higher risk)  

#### Migration Steps

1. Assess current 1.1 implementation  
2. Map 1.1 data to 1.2 schema  
3. Update integration layer  
4. Validate outputs  
5. Run pilot  
6. Full rollout  

#### Common Pitfalls

- Misaligned identifiers  
- Enrollment edge cases  
- Role mapping inconsistencies  
- Partial adoption of new fields  

---

### Section 5: Guided Hands-On Activity #2: Testing a OneRoster 1.2 API (35 min)

Using either:
- The updated CSV dataset from Activity #1, or  
- A provided 1.2 CSV dataset  

Participants will:

1. Load the dataset into the provided system (iTORC acting as a OneRoster 1.2 provider)  
2. Configure the provider to align with OneRoster 1.2 certification requirements, including:
   - Query parameter handling (e.g., filtering, pagination)  
   - OAuth scopes and access controls  
   - Endpoint behavior expectations  
3. Use an API client (e.g., Postman or their own system) to make API calls against the provider  
4. Retrieve and process results from key endpoints (e.g., orgs, users, classes, enrollments)  
5. Validate behavior by testing their instance against the 1EdTech OneRoster 1.2 certification tooling  
6. Observe and analyze validation results  

Focus on:
- How configuration impacts API behavior and compliance  
- How data quality impacts API responses  
- Correctness of relationships and references  
- Alignment with OneRoster 1.2 certification expectations  

> **Note:**  
> If issues arise with the transformed dataset from Activity #1, do not spend excessive time troubleshooting data problems. Participants may switch to the provided 1.2 dataset to continue focusing on API behavior and certification alignment.

**Wrap-up:**  
Facilitated discussion on:
- What worked as expected vs what failed  
- Configuration changes required to meet certification  
- Differences between API output and CSV assumptions  
- Insights from certification tooling results  

---

### Section 6: Validation & Wrap (15 min)

#### Validation Checklist

- Schema compliance  
- Referential integrity  
- Enrollment correctness  

#### Testing Strategies

- Unit tests for mappings  
- End-to-end validation  

#### Debugging Techniques

- API logs  
- Error codes  
- Comparing CSV vs API responses  

#### 1EdTech Support Channels

- Overview of available support resources:
  - Certification support channels  
  - Community forums and working groups  
  - Documentation and implementation guides  
- Guidance on when and how to engage:
  - Troubleshooting certification failures  
  - Clarifying specification requirements  
  - Aligning with Ed-Fi / OneRoster API efforts  

#### Wrap-Up

- Key takeaways from activities and discussions  
- Open Q&A  
