ALTER TABLE public.party
	ADD CONSTRAINT FK_party_country
	FOREIGN KEY (id_country) REFERENCES public.country (id_country);
