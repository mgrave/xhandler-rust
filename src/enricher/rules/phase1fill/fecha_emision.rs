use crate::enricher::enrich::Defaults;
use crate::models::traits::fechaemision::{FechaEmisionGetter, FechaEmisionSetter};

pub trait FechaEmisionEnrichRule {
    fn fill(&mut self, defaults: &Defaults) -> bool;
}

impl<T> FechaEmisionEnrichRule for T
where
    T: FechaEmisionGetter + FechaEmisionSetter,
{
    fn fill(&mut self, defaults: &Defaults) -> bool {
        match &self.get_fechaemision() {
            Some(..) => false,
            None => {
                self.set_fechaemision(defaults.date);
                true
            }
        }
    }
}
