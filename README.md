# 🕺 Dance Category Analyser: Java Fundamentals Module

![Java Version](https://img.shields.io/badge/Java-8%2B-007396?style=for-the-badge&logo=java&logoColor=white)
![Build Status](https://img.shields.io/badge/Status-Passing-success?style=for-the-badge)
![Package](https://img.shields.io/badge/Package-DANCE--ANALYZER-purple?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

*"Performance evaluation pipeline initialized. Multi-tier award classification and category-filtered scoring active."*

This repository contains the full source code and documentation for the **Dance Category Analyser**, a Java application designed to evaluate, categorize, and rank dance competition routines. The module demonstrates standard I/O processing using `Scanner`, dynamic arrays, multi-level conditional branching, category aggregation, and string formatting.

---

## 📌 Objective & Requirements

The primary objective of this module is to automate the scoring and classification workflow for dance competitions, providing clear insights into individual performance scores as well as category-wide metrics (Solo vs. Group).

### 🎯 Technical Features & Checklist
- [x] **Dynamic Input Processing:** Interactive terminal prompts using `java.util.Scanner`.
- [x] **Category Filtering & Classification:** Categorizes entries as either **Solo** or **Group** routines.
- [x] **Multi-Tier Award System:** Evaluates judge scores (0.0 – 100.0) and assigns formal award tiers:
  - 🥇 **Platinum:** 90.0 – 100.0
  - 🥈 **High Gold:** 80.0 – 89.9
  - 🥉 **Gold:** 70.0 – 79.9
  - 🎖️ **Silver:** Below 70.0
- [x] **Category Analytics Engine:** Computes independent statistical averages for Solos and Groups while preventing division-by-zero errors.
- [x] **Top Performer Spotlight:** Dynamically tracks and highlights the overall highest-scoring routine in the competition.
- [x] **Formatted Terminal Output:** Clean display utilizing `System.out.printf` for aligned columnar reports.

---

## 🏗 System Architecture & Directory Structure

```text
src/
└── DanceCategoryAnalyser.java    # Main Driver Class (Input, Analysis, Reporting)