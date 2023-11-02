# Hackatón
![Alt text](HT3.png)
# CourseAssessmentDetails
---
```http://127.0.0.1:9090/course_assessment_details```

```
{
    "score" : "20",
    "section" : "Auditorio",
    "sectionGroup": "Teoria 1",
    "courseAssessment":{
    "id":1,
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
![Alt text](image-39.png)
![Alt text](image-41.png)
![Alt text](image-40.png)

```
{
    "score" : "Retirado",
    "section" : "A707 - A708",
    "sectionGroup": "Teoria 2",
    "courseAssessment":{
    "id":5,
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
    },

    "professor":{
        "id":3,
        "name": "Eduardo",
        "lastName": "Castillo Ruiz",
        "email":"castillo.ruiz@utec.edu.pe",
        "fullName":"Eduardo Castillo Ruiz"

    },

    "student":{
        "id":3,
        "name": "Gian Marco",
        "email": "gian.arteaga@utec.edu.pe",
        "code": "202120094"
    }
}
```

![Alt text](image-42.png)
![Alt text](image-44.png)
![Alt text](image-43.png)

```
{
    "score" : "17",
    "section" : "A904",
    "sectionGroup": "Teoria 1",
    "courseAssessment":{
    "id":4,
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
        "id":2,
        "code":"FundacionRosExp",
        "name":"2023"
    },
    "title":"Examen Final",
    "tipoNota":"Aprobado",
    "numNota": "17",
    "nomenclatura":"AD"
    
    },

    "professor":{
    "id": 2,
    "name": "Brenner",
    "lastName": "Ojeda",
    "email": "ojeda@utec.edu.pe",
    "fullName": "Brenner Ojeda"
},

    "student":{
        "id":2,
        "name": "Gian Marco",
        "email": "gian.arteaga@utec.edu.pe",
        "code": "202120094"
    }
}
```
![Alt text](image-47.png)
![Alt text](image-46.png)
![Alt text](image-45.png)
---
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
```
{
    "id": 3,
    "name": "Eduardo",
    "lastName": "Castillo Ruiz",
    "email": "castillo.ruiz@utec.edu.pe",
    "fullName": "Eduardo Castillo Ruiz"
}
```

```
{
    "id": 2,
    "name": "Brenner",
    "lastName": "Ojeda",
    "email": "ojeda@utec.edu.pe",
    "fullName": "Brenner Ojeda"
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


