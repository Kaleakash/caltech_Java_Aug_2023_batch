import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StringInterpolationComponent } from './string-interpolation.component';

describe('StringInterpolationComponent', () => {
  let component: StringInterpolationComponent;
  let fixture: ComponentFixture<StringInterpolationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [StringInterpolationComponent]
    });
    fixture = TestBed.createComponent(StringInterpolationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
