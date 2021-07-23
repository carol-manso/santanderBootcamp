import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { ReplacePipe } from "../shared/pipes/replace.pipe";
import { StarComponent } from "../shared/components/star/star.component";
import { CourseInfoComponent } from "./course-info.component";
import { CourseListComponent } from "./course-list.component";
import { StarModule } from "../shared/components/star.module";
import { AppPipeModule } from "../shared/pipes/pipe.module";

@NgModule({
    declarations:[
        CourseListComponent, 
        CourseInfoComponent,
       
        
    ], 
    imports : [
        CommonModule,
        FormsModule,
        StarModule,
        AppPipeModule,
        RouterModule.forChild([
            {
                path : 'courses', component : CourseListComponent 
              },
               
               {
                 path : 'courses/info/:id', component: CourseInfoComponent
               },  
              
                                                                                                                                                                                                                                                                                                                                                                                               
        ]),
    ]
})

export class CourseModule {

}