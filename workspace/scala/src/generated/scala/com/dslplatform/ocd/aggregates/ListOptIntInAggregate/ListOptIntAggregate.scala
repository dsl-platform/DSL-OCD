package com.dslplatform.ocd.aggregates.ListOptIntInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptIntAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptInt: IndexedSeq[Option[Int]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptIntInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptIntAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptIntAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptIntInAggregate.ListOptIntAggregate): this.type = {
    this.URI = result.URI;
    this._listOptInt = result._listOptInt;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptIntInAggregate.ListOptIntAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptInt")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptInt = {
    _listOptInt
  }

  def listOptInt_= (value: IndexedSeq[Option[Int]]) {
    _listOptInt = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptInt") listOptInt: IndexedSeq[Option[Int]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptInt = if (listOptInt == null) IndexedSeq.empty else listOptInt)

}

object ListOptIntAggregate extends AggregateRootCompanion[ListOptIntAggregate]{

  def apply(
    listOptInt: IndexedSeq[Option[Int]] = IndexedSeq[Option[Int]]()
  ) = {
    new ListOptIntAggregate(
      _locator = None
    , _URI = null
    , _listOptInt = listOptInt)
  }

}
