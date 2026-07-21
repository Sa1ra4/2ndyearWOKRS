# Data-Structure-Scrore_Analyzer: Academic Performance Readiness Check
*"Array index synchronized. Threshold branch verified. Automated evaluation running..."*

This repository contains the solution for the Score Analyzer Diagnostic, a foundational Java program designed to verify memory traversal, conditional branching, and modular statistical analysis using raw academic evaluation metrics.

---

## Objective & Requirements
The primary goal of this utility is to demonstrate core control flow, mathematical aggregation, and decoupled architectural design without relying on external collections libraries (`ArrayList`, `Vector`, etc.).


### Technical Constraints Checklist
* **Sequential Storage:** Primary memory handled entirely via raw primitive arrays (`int[]`).
* **Iteration:** Traverses elements using enhanced for-loop structures (`for (int score : scores)`).
* **Conditional Logic:** Filters performance status using evaluation branching (`if (score >= 60)`).
* **Modular Architecture:** Program logic divided across parameterized utility methods (`evaluateIndividualScores`, `generateSummaryReport`).
* **Defensive Programming:** Implements explicit `null` and zero-length array guards before attempting memory access.

---


## System Architecture
The program operates on a **decoupled processing pipeline** to analyze memory without mutation:

1. **Evaluation Phase:** Traverses raw dataset to print individual pass/fail records based on threshold analysis ($\60$).
2. **Aggregation Phase:** Runs a second sequence pass to calculate sum, pass/fail totals, and floating-point arithmetic mean.
3. **Report Generation:** Formats diagnostic output to stdout with precision-bound metrics.

---


## Technical Blueprint

### Utility Interface Breakdown

| Method Signature | Flow Type | Primary Responsibility |
| :--- | :--- | :--- |
| `main(String[] args)` | Orchestration | Entry point; feeds raw dataset into processing pipeline. |
| `evaluateIndividualScores(int[], int)` | Diagnostic Stream | Traverses dataset to output per-element status evaluations. |
| `generateSummaryReport(int[], int)` | Analytics Engine | Accumulates totals, calculates class average, prints summary report. |

---

## Execution & Verification

### System Requirements
* **Java Runtime Environment:** JDK 8+

### Launch Commands
```bash
# 1. Compile source matrix
javac ScoreAnalyser.java

# 2. Execute diagnostic override
java ScoreAnalyser