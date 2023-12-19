import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login/login.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { CustomerdashboardComponent } from './customerdashboard/customerdashboard.component';
import { SignupComponent } from './login/signup/signup.component';

const routes: Routes = [
  {path:"",component:LoginComponent},
  {path:"admin",component:AdmindashboardComponent},
  {path:"customer",component:CustomerdashboardComponent},
  {path:"signup",component:SignupComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
