select
	p.codi,
	sum(coalesce(coalesce(debit.import_debit,debit.import_credit),0)) as debit,
	sum(coalesce(coalesce(credit.import_debit,credit.import_credit),0)) as credit,
	case p.tipus = 'ACTIU'
		then sum(o.import,sum(coalesce(coalesce(debit.import_debit,debit.import_credit),0))) as ACTIU
	case p.tipus = 'PASSIU'
		then sum(o.import,sum(coalesce(coalesce(debit.import_debit,debit.import_credit),0))) as PASSIU

from
pla_comptable p
right join comptabilitat debit on p.codi = debit.compte_debit 
right join comptabilitat credit on p.codi = credit.compte_credit
right join obertura_2015 o on p.codi = o.codi
join pla_comptable_tipus pct on p.tipus = pct.tipus
group by p.codi
order by pct.id, p.codi;