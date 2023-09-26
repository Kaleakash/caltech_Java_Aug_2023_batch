import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventBidngnComponent } from './event-bidngn.component';

describe('EventBidngnComponent', () => {
  let component: EventBidngnComponent;
  let fixture: ComponentFixture<EventBidngnComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EventBidngnComponent]
    });
    fixture = TestBed.createComponent(EventBidngnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
