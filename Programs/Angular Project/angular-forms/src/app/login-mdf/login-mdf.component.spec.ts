import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginMdfComponent } from './login-mdf.component';

describe('LoginMdfComponent', () => {
  let component: LoginMdfComponent;
  let fixture: ComponentFixture<LoginMdfComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LoginMdfComponent]
    });
    fixture = TestBed.createComponent(LoginMdfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
