import { NgModule } from "@angular/core";
import { Router, RouterModule } from "@angular/router";
import { Error404Compnent } from "./component/error-404/error-404.component";
import { NavBarComponent } from "./component/nav-bar/nav-bar.component";

@NgModule({
    declarations : [
        NavBarComponent,
        Error404Compnent
    ],
    imports: [
        RouterModule.forChild([
            {
                path: '', redirectTo : 'courses', pathMatch : 'full'
              },
            {
             path: '**', component : Error404Compnent
           }, 
         ])
    ],
    exports : [
        NavBarComponent
    ]
    
})




export class CoreModule{

}