package com.dslplatform.ocd.aggregates.ListOptDecimalInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptDecimalAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptDecimal: IndexedSeq[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptDecimalInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptDecimalAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptDecimalAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptDecimalInAggregate.ListOptDecimalAggregate): this.type = {
    this.URI = result.URI;
    this._listOptDecimal = result._listOptDecimal;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptDecimalInAggregate.ListOptDecimalAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptDecimal")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptDecimal = {
    _listOptDecimal
  }

  def listOptDecimal_= (value: IndexedSeq[Option[BigDecimal]]) {
    _listOptDecimal = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptDecimal") listOptDecimal: IndexedSeq[Option[BigDecimal]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptDecimal = if (listOptDecimal == null) IndexedSeq.empty else listOptDecimal)

}

object ListOptDecimalAggregate extends AggregateRootCompanion[ListOptDecimalAggregate]{

  def apply(
    listOptDecimal: IndexedSeq[Option[BigDecimal]] = IndexedSeq[Option[BigDecimal]]()
  ) = {
    new ListOptDecimalAggregate(
      _locator = None
    , _URI = null
    , _listOptDecimal = listOptDecimal)
  }

}
