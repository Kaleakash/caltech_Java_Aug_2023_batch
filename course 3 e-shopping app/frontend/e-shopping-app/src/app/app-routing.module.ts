import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { CustomerhomeComponent } from './customerhome/customerhome.component';
import { ProductbyadminComponent } from './productbyadmin/productbyadmin.component';
import { ProductbycustomerComponent } from './productbycustomer/productbycustomer.component';

const routes: Routes = [
  {path:"signIn",component:LoginComponent},
  {path:"signUp",component:SignupComponent},
  {path:"adminhome",component:AdminhomeComponent,children:[
    {path:"adminproduct",component:ProductbyadminComponent}
  ]},

  {path:"customerhome",component:CustomerhomeComponent,children:[
    {path:"customerproduct",component:ProductbycustomerComponent}
  ]},
  
  {path:"",redirectTo:"signIn",pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
