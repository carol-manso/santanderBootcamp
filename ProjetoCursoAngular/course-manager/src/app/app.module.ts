import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { NavBarComponent } from './core/component/nav-bar/nav-bar.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { Error404Compnent } from './core/component/error-404/error-404.component';
import { CourseModule } from './courses/course.module';
import { StarModule } from './shared/components/star.module';
import { CoreModule } from './core/core.module';

@NgModule({
  declarations: [
    AppComponent,      
  ],
  imports: [
    BrowserModule, 
    FormsModule, 
    CourseModule,
    HttpClientModule,
    CoreModule,

    RouterModule.forRoot([
     
   
    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
