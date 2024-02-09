import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductbycustomerComponent } from './productbycustomer.component';

describe('ProductbycustomerComponent', () => {
  let component: ProductbycustomerComponent;
  let fixture: ComponentFixture<ProductbycustomerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductbycustomerComponent]
    });
    fixture = TestBed.createComponent(ProductbycustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
