# Overjet Coding Exercise: Software Engineer

> **Overjet Confidential**: Please treat this as proprietary information. It is prohibited to distribute or share this test without explicit written permission from **Overjet**.

This is a coding exercise/assessment for Software Engineer candidates applying to [Overjet](https://overjet.ai). The goal is to follow the instructions provided here and complete as many of the exercises as possible, within the agreed time limit.

The time limit for this assessment is: `2 hours`.

At the end of 2 hours, please follow the instructions in the [Submit Results](#Submit-Results) section. We will then review your submission and discuss your process during a follow-up interview.

We're looking for creativity and a reflection of your skillset. Thanks!

<!-- MarkdownTOC -->

- [Setup](#setup)
    - [Support Links](#support-links)
- [Coding Exercise Goals](#coding-exercise-goals)
    - [Constraints:](#constraints)
- [Submit Results](#submit-results)

<!-- /MarkdownTOC -->

## Setup

First, this is a Git repository, so please be sure that you have `git` available and configured.

Please commit all code changes however you believe would follow best-practices for professional Software Engineering.

You can assume that this task was given to you as a ticket named `TEST-2020`, so feel free to use that in any commits or branches you may create.


### Support Links

- https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
- https://www.cprime.com/resources/blog/docker-on-mac-with-homebrew-a-step-by-step-tutorial/
- https://varrette.gforge.uni.lu/blog/2019/09/10/using-pyenv-virtualenv-direnv/

## Coding Exercise Goals

These are the main goals of the exercise. You should try to complete these in order, but feel free to jump between them and get as much done as you can.

You are tasked with creating an API that helps maintain a caching service.

1. You are to design an API at an endpoint named `/patients`, an API that will accept a "Patient" payload as given below in JSON format:
```json
{
    "patient_id": "Patient H. Name",
    "hospital_id": "hospital-abc",
    "visit_id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
    "documents": [
        "sample_a.doc",
        "sample_b.pdf",
        "other_sample_c.TIFF"
    ],
    "patient_issues": [
        {
            "issue_id": "01",
            "issue_desc": "Ache in ear, with slight ringing.",
            "bodypart": "head-ear"
        },
        {
            "issue_id": "02",
            "issue_desc": "nosebleed",
            "bodypart": "head-nose"
        }
    ]
}

```
2. You should save the provided data in a local database named (`hospital_db`) -- you can choose whichever Database you are most comfortable with.
3. Each Patient API payload will have a `documents` array as shown. When you have the `documents` correctly populated (at least 1 element in the list) you will add it to a Cache with key-value pairs of the `patient_id` to the `documents` list.
4. We then imagine that there is a separate service reading from the cache and the entries from this cache are being evicted by the imaginary service. So you are to provide a "get without eviction" (`/patient-from-cache`) endpoint and a "get with eviction" (`/patient-with-eviction-from-cache`) endpoint operation on the cache.

Your overall task is to implement these 3 API endpoints to be as "production ready" as possible in whatever programming language you prefer. Please be sure to follow best practices in your software development that will highlight your professional Software Engineering experience.

### Constraints:

1. Add basic validations on the incoming attributes -- _e.g._, `patient_id` has to be a string and non-empty.
2. Expect thousands of reads and writes on this API per hour, and design accordingly.
3. The logging and monitoring of any system in an Enterprise code is very important -- what would you do to allow us to trace each log with the incoming `visit_id`?
4. Please follow best-practices with the API design and write production-ready code.

## Submit Results

At the end of the time period:

- Please make sure you have committed all your changes to the local git repository in this project folder.
- Zip the entire project directory, and respond to the email account you received this exercise from.

You can provide any notes or links you want to share in the email or here in the project directory.
