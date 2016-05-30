# ResumeBuilder Services

How to use
==========
> - Install Mongodb and start the mongo server in it's default setting
> - Clone the repo , and do the maven import in the IDE or do mvn clean install
> - Run the ResumeBuilder.java class to start the service .


Following Operations are supported :
===================================
> - Create Resume
      POST 
      Sample PayLoad /Request body
      
-----------------------------------------------------------      
      { "basicInformation": {
          "fullName": "Vishwa Mohan New",
          "emailAdress": "kakfaswa@gmail.com",
          "mobile_number": "935325325353",
          "residence_address": "wwqrwiofweknwdwlw"
        },
        "objective": {
          "objective_explanation": "Some randome explanation"
        },
        "educationalDetails": [
           {
            "instituteName": "SomeRandomInsititute",
            "percent_grade": "awwewww",
            "status": "asfew",
            "degree": "feew",
            "location": "fewrew",
            "completionYear": "fwerew",
            "description": "feeef"
           }
        ],
        "companyDetails": [
           {
            "title": "",
            "companyName": "",
            "location": "",
            "start_date": "",
            "end_date": "",
            "compensation": "",
            "currency": "",
            "period": "",
            "description": ""
           }
        ],
        "hobbiesAndInterests": {
          "hobbiesAndInterests": "sadwfe"
        },
        "professionalSkills": [
           {
            "skillType": "asfew",
            "level": "aff"
           }
        ],
        "languages": [
           {
            "name": "English",
            "level": "High"
           }
        ],
        "references": [
          {
           "name": "sasaf",
           "relationship": "asfs",
           "phone_number": "asfef",
           "company": "sfewfefef",
           "email_address": "wewee",
           "address": "wwwwerwrw",
           "adress1": "asfwfw",
           "description": "adadffe"
          }
        ] 
     }

------------------------------------------------------

End Point : http://localhost:8080/v1/api/resume/ (When running on the local system)


> - Get Resume
    GET request
    End Point : http://localhost:8080/v1/api/resume/{id}

> - Delete Resume
    DELETE request
    End Point : http://localhost:8080/v1/api/resume/{id}
    
> - Update Resume
    PUT request
    End Point : http://localhost:8080/v1/api/resume/{id}
    PayLoad will be same as that of the POST request



