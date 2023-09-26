import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StructureDirectiveComponent } from './structure-directive.component';

describe('StructureDirectiveComponent', () => {
  let component: StructureDirectiveComponent;
  let fixture: ComponentFixture<StructureDirectiveComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [StructureDirectiveComponent]
    });
    fixture = TestBed.createComponent(StructureDirectiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
