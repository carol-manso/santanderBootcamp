import { OnInit } from "@angular/core";
import { Component } from "@angular/core";
import { Course } from "./course";


@Component({
    selector : 'app-course-list', 
    templateUrl:  './course-list.component.html'
})
export class CourseListComponent implements OnInit{
    courses: Course[] = [];
    
   
    

    ngOnInit(): void { 
        this.courses = [
            {
                id : 1, 
                name : 'Angular Forms', 
                imageUrl : '', 
                price : 99.99, 
                duration : 120, 
                rating : 4.5, 
                description : 'Curso dedicado ao ensino de Angular Forms', 
                releaseDate: 'December 2, 2020',
                code: 'XPS- 87684', 
            }, 
            {
                id : 2, 
                name : 'Angular HTTP', 
                imageUrl : '', 
                price : 90.99, 
                duration : 125, 
                rating : 4, 
                description : 'Curso dedicado ao ensino de Angular HTTP', 
                releaseDate: 'November 4, 2020',
                code: 'XTR- 89984', 
            }

        ]
    }
}