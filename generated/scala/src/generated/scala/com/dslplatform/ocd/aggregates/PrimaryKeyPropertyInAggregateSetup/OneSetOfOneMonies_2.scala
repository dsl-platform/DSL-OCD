package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneMonies_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneMonies: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneMonies_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneMonies_2("+ URI +")"

   def copy(oneSetOfOneMonies: Set[BigDecimal] = this._oneSetOfOneMonies): OneSetOfOneMonies_2 = {

  require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)
    new OneSetOfOneMonies_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneMonies = oneSetOfOneMonies)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneMonies_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneMonies = result._oneSetOfOneMonies
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneMonies_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneMonies = {
    _oneSetOfOneMonies
  }

  def oneSetOfOneMonies_= (value: Set[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneMonies = value

    _oneSetOfOneMonies = com.dslplatform.api.Guards.setCollectionScale(_oneSetOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMonies") oneSetOfOneMonies: Set[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneMonies = if (oneSetOfOneMonies == null) Set.empty else oneSetOfOneMonies)

}

object OneSetOfOneMonies_2 extends AggregateRootCompanion[OneSetOfOneMonies_2]{

  def apply(
    oneSetOfOneMonies: Set[BigDecimal] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)
    require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
    new OneSetOfOneMonies_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneMonies = oneSetOfOneMonies)
  }

}
