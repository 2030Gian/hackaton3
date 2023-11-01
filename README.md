# Hackatón
![Alt text](HT3.png)
# CourseAssessmentDetails
```
{
    "score" : "15",
    "section" : "A708",
    "sectionGroup": "Grupo 1",
    "courseAssessment":{
        "id":6,
        "periodo":{
            "id":1,
            "name": "2023-2",
            "code": "FundationRosExp"
        },
        "course":{ 
            "id":8, 
            "courseType":{
                "id": 1,
                "name" :"Ciencias"
            },

            "name": "Calculo 1",
            "credits":4,
            "code" : "CC2021",
            "hrGroup":"RosExp",
            "cycle": 1,
            "vrGroup": "1"
        },
        "title":"Prueba de Entrada",
        "tipoNota":"Aprobado",
        "numNota": "20",
        "nomenclatura":"AD"
    },

    "professor":{
        "id":1,
        "name": "Jesus",
        "lastName": "Bellido",
        "email":"jesus.bellido@utec.edu.pe",
        "fullName":"Jesus Bellido"

    },

    "student":{
        "id":1,
        "name": "Gian Marco",
        "email": "gian.arteaga@utec.edu.pe",
        "code": "202120094"
    }
}
```
# Professor

---
http://127.0.0.1:9090/professors
{
    "name": "Jesus",
    "lastName": "Bellido",
    "email":"jesus.bellido@utec.edu.pe",
    "fullName":"Jesus Bellido"
}
---


# Student
---
http://127.0.0.1:9090/students
{
    "name": "Gian Marco",
    "email": "gian.arteaga@utec.edu.pe",
    "code": "202120094"
}

---

# CourseAssessment

---
http://127.0.0.1:9090/course_assessments
```
{

    "course":{  
    "id": 2,      
    "name": "Ecuaciones Diferenciales",
    "credits":4,
    "code" : "CC2021",
    "hrGroup":"RosExp",
    "cycle": 3,
    "vrGroup": "1",
    "courseType": {
        "id": 3,
        "name" :"Ciencias"
    }

    },

    "periodo":{
        "id":1,
        "code":"FundacionRosExp",
        "name":"2023"
    },
    "title":"Prueba de Entrada",
    "tipoNota":"Aprobado",
    "numNota": "20",
    "nomenclatura":"AD"
}
```
---
# Periodo
---
```http://127.0.0.1:9090/periodos```
```
{    
    "name": "2023-2",
    "code": "FundationRosExp"
}
```
![Alt text](image-15.png)
![Alt text](image-16.png)
![Alt text](image-17.png)
---


## Course
---
```http://127.0.0.1:9090/courses```
```
{    

    "name": "Desarrollo Basado en Plataformas",
    "credits":4,
    "code" : "CS2031",
    "hrGroup":"RosExp",
    "cycle": 3,
    "vrGroup": "Computacion",
    "courseType": {
        "id": 1,
        "name" :"Ciencias de la Computacion"
    }

}
```
![Alt text](image.png)
![Alt text](image-1.png)
![Alt text](image-2.png)

```
{    

    "name": "Base de Datos I",
    "credits":4,
    "code" : "CS2041",
    "hrGroup":"RosExp",
    "cycle": 3,
    "vrGroup": "Computacion",
    "courseType": {
        "id": 2,
        "name" :"Ciencias de Datos"
    }

}
```
![Alt text](image-6.png)
![Alt text](image-7.png)
![Alt text](image-8.png)

```
{    

    "name": "Opticas y Ondas",
    "credits":4,
    "code" : "CC1123",
    "hrGroup":"RosExp",
    "cycle": 2,
    "vrGroup": "Ciencias",
    "courseType": {
        "id": 4,
        "name" :"Ciencias"
    }

}
```
![Alt text](image-12.png)
![Alt text](image-13.png)
![Alt text](image-14.png)
---

## CourseType
---
```http://127.0.0.1:9090/course_types```
```
{
    "name": "Ciencias de la Computacion (CS)"
}
```
```
{
    "name": "Ciencias de Datos (CD)"
}
```

```
{
    "name": "Opticas y Ondas"
}
```
![Alt text](image-3.png)
![Alt text](image-5.png)
![Alt text](image-4.png)
![Alt text](image-11.png)
![Alt text](image-9.png)
![Alt text](image-10.png)
---


