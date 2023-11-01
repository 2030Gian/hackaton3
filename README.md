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
```http://127.0.0.1:9090/professors```
```
{
    "name": "Jesus",
    "lastName": "Bellido",
    "email":"jesus.bellido@utec.edu.pe",
    "fullName":"Jesus Bellido"
}
```
![Alt text](image-36.png)
![Alt text](image-37.png)
![Alt text](image-38.png)
---


# Student
---
```http://127.0.0.1:9090/students```
```
{
    "name": "Gian Marco",
    "email": "gian.arteaga@utec.edu.pe",
    "code": "202120094"
}
```

![Alt text](image-33.png)
![Alt text](image-35.png)
![Alt text](image-34.png)
---

# CourseAssessment

---
```http://127.0.0.1:9090/course_assessments```
```
{

    "course":{    
    "id":1,
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

    },

    "periodo":{
        "id":1,
        "code":"FundacionRosExp",
        "name":"2023"
    },
    "title":"Hakaton 3",
    "tipoNota":"Aprobado",
    "numNota": "20",
    "nomenclatura":"AD"
    
}
```
![Alt text](image-18.png)
![Alt text](image-20.png)
![Alt text](image-19.png)

```
{

    "course":{    
    "id":2,
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

    },

    "periodo":{
        "id":1,
        "code":"FundacionRosExp",
        "name":"2023"
    },
    "title":"Examen Parcial 3",
    "tipoNota":"Aprobado",
    "numNota": "17",
    "nomenclatura":"AD"
    
}
```
![Alt text](image-27.png)
![Alt text](image-29.png)
![Alt text](image-28.png)

```
{

    "course":{    
    "id":3,
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
    },

    "periodo":{
    "id":3,    
    "name": "2023-2",
    "code": "CC"
    },
    "title":"Examen Parcial 3",
    "tipoNota":"Retirado",
    "numNota": "Retirado",
    "nomenclatura":"Retirado"
    
}
```
![Alt text](image-30.png)
![Alt text](image-32.png)
![Alt text](image-31.png)
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

```
{    
    "name": "2023-2",
    "code": "BD"
}
```
![Alt text](image-21.png)
![Alt text](image-23.png)
![Alt text](image-22.png)

```
{    
    "name": "2023-2",
    "code": "CC"
}
```
![Alt text](image-24.png)
![Alt text](image-26.png)
![Alt text](image-25.png)
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


