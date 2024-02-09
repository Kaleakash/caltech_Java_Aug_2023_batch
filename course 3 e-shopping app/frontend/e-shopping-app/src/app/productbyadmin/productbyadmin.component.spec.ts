import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductbyadminComponent } from './productbyadmin.component';

describe('ProductbyadminComponent', () => {
  let component: ProductbyadminComponent;
  let fixture: ComponentFixture<ProductbyadminComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductbyadminComponent]
    });
    fixture = TestBed.createComponent(ProductbyadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
