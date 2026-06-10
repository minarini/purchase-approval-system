# Purchase Approval System

A Spring Boot REST API developed during the NTT DATA Java & Spring Boot Bootcamp by DIO (Digital Innovation One).

## Overview

This project implements a purchase request approval workflow using Design Patterns. Requests are automatically approved according to their value and routed through different approval levels.

Approval flow:

* Supervisor: up to 1,000
* Manager: up to 10,000
* Director: up to 50,000
* Presidency: above 50,000

## Technologies

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven

## Design Patterns

* Singleton
* Strategy
* Facade
* Chain of Responsibility

## API Features

* Create purchase requests
* Retrieve all requests
* Retrieve a request by ID
* Delete requests
* Automatic approval processing
* Approval tracking
* Request creation timestamp

## Example Request

```json
{
  "description": "Office chairs",
  "value": 5000
}
```

## Example Response

```json
{
  "id": 1,
  "description": "Office chairs",
  "value": 5000,
  "approvedBy": "Manager",
  "createdAt": "2026-06-10T18:14:52.4774406",
  "status": "APPROVED"
}
```
